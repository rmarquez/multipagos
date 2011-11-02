package com.metropolitana.multipagos.forms.informes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



import com.metropolitana.multipagos.DetalleVisitas;
import org.apache.ojb.broker.PersistenceBroker;
import org.apache.ojb.broker.PersistenceBrokerFactory;
import org.apache.ojb.broker.query.Criteria;
import org.apache.ojb.broker.query.ReportQueryByCriteria;



/**
 * 
 * @author rmarquez
 *
 */
public class InformeVisitasXColector {
	
	
	public static List getVisitasXColector(Date fechaIni,
			Date fechaFin, Integer colectorId) throws Exception {
		PersistenceBroker broker = null;
		try {
			List<Object[]> lista = new ArrayList<Object[]>();
			broker = PersistenceBrokerFactory.defaultPersistenceBroker();
			for (Iterator iter = broker
					.getReportQueryIteratorByQuery(queryVisitasXColector(fechaIni, fechaFin, colectorId)); iter.hasNext();) {
				Object[] detalle = (Object[]) iter.next();
				
                lista.add(detalle);
			}
			return lista;
		} catch (Exception e) {
			throw e;
		} finally {
			if (broker != null && !broker.isClosed()) {
				broker.close();
			}
		}
	}
	
	private static ReportQueryByCriteria queryVisitasXColector(Date fechaIni, Date fechaFin, Integer colectorId) {

		Criteria criterio = new Criteria();

		if (fechaIni != null) {
			criterio.addGreaterOrEqualThan("fechaVisita", fechaIni);
		}
		if (fechaFin != null) {
			criterio.addLessOrEqualThan("fechaVisita", fechaFin);
		}
		if (colectorId != null) {
			criterio.addEqualTo("colectorId", colectorId);
		}
        
		ReportQueryByCriteria query = new ReportQueryByCriteria(DetalleVisitas.class,
				criterio);
		query.setAttributes(new String[] { "visitaId", "numeroContrato",
				"carteraIdRef.suscriptor", "carteraIdRef.localidadIdRef.localidadNombre",
				"fechaVisita", "simboloIdRef.simboloNumero", "simboloIdRef.simboloNombre",
				"servicioIdRef.servicioNombre", "colectorId", "colectorIdRef.colectorNumero", "colectorIdRef.primerNombre",
				"colectorIdRef.primerApellido","avisoCobro", "fprogCobro"});
		
		query.addGroupBy(new String[] { "visitaId", "numeroContrato",
				"carteraIdRef.suscriptor", "carteraIdRef.localidadIdRef.localidadNombre",
				"fechaVisita", "simboloIdRef.simboloNumero", "simboloIdRef.simboloNombre",
				"servicioIdRef.servicioNombre", "colectorId", "colectorIdRef.colectorNumero", "colectorIdRef.primerNombre",
				"colectorIdRef.primerApellido","avisoCobro", "fprogCobro"});
		

		query.addOrderBy("numeroContrato", true);
		query.addOrderBy("fechaVisita", true);
		query.addOrderBy("colectorId", true);
		return query;
	}

}
