importClass(Packages.java.lang.Integer);
function migrarform(form) {   
		var usrId = auth_getUserID();
		var handler = new Packages.com.metropolitana.multipagos.forms.xlstopostgresql.XlsIbwPendientes();
		var util = Packages.com.metropolitana.multipagos.forms.Util();
		var numLote = handler.numeroLote(usrId);
		var bean = handler.getPendientesIbw(numLote, usrId);
		
		cocoon.sendPageAndWait("forms/migrar/results.pdf", {"bean" : bean, "util" : util});
}

