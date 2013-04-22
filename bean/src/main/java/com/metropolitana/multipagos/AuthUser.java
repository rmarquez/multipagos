//==============================================================================
//===   auth_user.java                        Build:2679
//==============================================================================

package com.metropolitana.multipagos;

import java.util.*;
import java.math.*;
import com.metropolitana.multipagos.*;

//==============================================================================

public class AuthUser implements java.io.Serializable
{

   //---------------------------------------------------------------------------


   //---------------------------------------------------------------------------

   private Integer    usrId;
   private String     usrLogin;
   private String     usrFullName;
   private String     usrPassword;
   private Boolean    usrEnable;
   private String     usrEmail;
   private String     usrCargo;
   private Boolean    usrEditdb;
   private Boolean    usrPinicio;
   private Integer    usrOrden;

   //---------------------------------------------------------------------------

   public Integer getUsrId() { return usrId; }

   public void setUsrId(Integer usrId)
   {
      this.usrId = usrId;
   }

   //---------------------------------------------------------------------------

   public String getUsrLogin() { return usrLogin; }

   public void setUsrLogin(String usrLogin)
   {
      this.usrLogin = usrLogin;
   }

   //---------------------------------------------------------------------------

   public String getUsrFullName() { return usrFullName; }

   public void setUsrFullName(String usrFullName)
   {
      this.usrFullName = usrFullName;
   }

   //---------------------------------------------------------------------------

   public String getUsrPassword() { return usrPassword; }

   public void setUsrPassword(String usrPassword)
   {
      this.usrPassword = usrPassword;
   }

   //---------------------------------------------------------------------------

   public Boolean getUsrEnable() { return usrEnable; }

   public void setUsrEnable(Boolean usrEnable)
   {
      this.usrEnable = usrEnable;
   }

   //---------------------------------------------------------------------------

   public String getUsrEmail() { return usrEmail; }

   public void setUsrEmail(String usrEmail)
   {
      this.usrEmail = usrEmail;
   }

   //---------------------------------------------------------------------------

   public String getUsrCargo() { return usrCargo; }

   public void setUsrCargo(String usrCargo)
   {
      this.usrCargo = usrCargo;
   }

   //---------------------------------------------------------------------------

   public Boolean getUsrEditdb() { return usrEditdb; }

   public void setUsrEditdb(Boolean usrEditdb)
   {
      this.usrEditdb = usrEditdb;
   }

   //---------------------------------------------------------------------------

   public Boolean getUsrPinicio() { return usrPinicio; }

   public void setUsrPinicio(Boolean usrPinicio)
   {
      this.usrPinicio = usrPinicio;
   }

   //---------------------------------------------------------------------------

   public Integer getUsrOrden() { return usrOrden; }

   public void setUsrOrden(Integer usrOrden)
   {
      this.usrOrden = usrOrden;
   }

   //---------------------------------------------------------------------------

   private Collection authUserRoleList = new ArrayList();

   public Collection getAuthUserRoleList() { return authUserRoleList;}

   public void setAuthUserRoleList(Collection c) { this.authUserRoleList = c;}

   public void addAuthUserRole( AuthUserRole authUserRole )
   {
      authUserRole.setUsrIdRef(this);
      authUserRoleList.add( authUserRole );
   }

   //---------------------------------------------------------------------------

   private Collection asignarColectorList = new ArrayList();

   public Collection getAsignarColectorList() { return asignarColectorList;}

   public void setAsignarColectorList(Collection c) { this.asignarColectorList = c;}

   public void addAsignarColector( AsignarColector asignarColector )
   {
      asignarColector.setUsrIdRef(this);
      asignarColectorList.add( asignarColector );
   }

   //---------------------------------------------------------------------------

   private Collection asignarVisitasList = new ArrayList();

   public Collection getAsignarVisitasList() { return asignarVisitasList;}

   public void setAsignarVisitasList(Collection c) { this.asignarVisitasList = c;}

   public void addAsignarVisitas( AsignarVisitas asignarVisitas )
   {
      asignarVisitas.setUsrIdRef(this);
      asignarVisitasList.add( asignarVisitas );
   }

   //---------------------------------------------------------------------------

   private Collection visitasList = new ArrayList();

   public Collection getVisitasList() { return visitasList;}

   public void setVisitasList(Collection c) { this.visitasList = c;}

   public void addVisitas( Visitas visitas )
   {
      visitas.setUsrIdRef(this);
      visitasList.add( visitas );
   }

   //---------------------------------------------------------------------------

   private Collection pagosList = new ArrayList();

   public Collection getPagosList() { return pagosList;}

   public void setPagosList(Collection c) { this.pagosList = c;}

   public void addPagos( Pagos pagos )
   {
      pagos.setUsrIdRef(this);
      pagosList.add( pagos );
   }

   //---------------------------------------------------------------------------

   private Collection arqueoPagosList = new ArrayList();

   public Collection getArqueoPagosList() { return arqueoPagosList;}

   public void setArqueoPagosList(Collection c) { this.arqueoPagosList = c;}

   public void addArqueoPagos( ArqueoPagos arqueoPagos )
   {
      arqueoPagos.setUsrIdRef(this);
      arqueoPagosList.add( arqueoPagos );
   }

   //---------------------------------------------------------------------------

   private Collection gestionBanproList = new ArrayList();

   public Collection getGestionBanproList() { return gestionBanproList;}

   public void setGestionBanproList(Collection c) { this.gestionBanproList = c;}

   public void addGestionBanpro( GestionBanpro gestionBanpro )
   {
      gestionBanpro.setUsrIdRef(this);
      gestionBanproList.add( gestionBanpro );
   }

   //---------------------------------------------------------------------------

   private Collection gestionAvonList = new ArrayList();

   public Collection getGestionAvonList() { return gestionAvonList;}

   public void setGestionAvonList(Collection c) { this.gestionAvonList = c;}

   public void addGestionAvon( GestionAvon gestionAvon )
   {
      gestionAvon.setUsrIdRef(this);
      gestionAvonList.add( gestionAvon );
   }

   //---------------------------------------------------------------------------

   private Collection avonPagosList = new ArrayList();

   public Collection getAvonPagosList() { return avonPagosList;}

   public void setAvonPagosList(Collection c) { this.avonPagosList = c;}

   public void addAvonPagos( AvonPagos avonPagos )
   {
      avonPagos.setUsrIdRef(this);
      avonPagosList.add( avonPagos );
   }

   //---------------------------------------------------------------------------

   private Collection gestionIbwList = new ArrayList();

   public Collection getGestionIbwList() { return gestionIbwList;}

   public void setGestionIbwList(Collection c) { this.gestionIbwList = c;}

   public void addGestionIbw( GestionIbw gestionIbw )
   {
      gestionIbw.setUsrIdRef(this);
      gestionIbwList.add( gestionIbw );
   }

   //---------------------------------------------------------------------------

   private Collection ibwPagosList = new ArrayList();

   public Collection getIbwPagosList() { return ibwPagosList;}

   public void setIbwPagosList(Collection c) { this.ibwPagosList = c;}

   public void addIbwPagos( IbwPagos ibwPagos )
   {
      ibwPagos.setUsrIdRef(this);
      ibwPagosList.add( ibwPagos );
   }

   //---------------------------------------------------------------------------

   private Collection pendientesClaroList = new ArrayList();

   public Collection getPendientesClaroList() { return pendientesClaroList;}

   public void setPendientesClaroList(Collection c) { this.pendientesClaroList = c;}

   public void addPendientesClaro( PendientesClaro pendientesClaro )
   {
      pendientesClaro.setUsrIdRef(this);
      pendientesClaroList.add( pendientesClaro );
   }
}

//==============================================================================

