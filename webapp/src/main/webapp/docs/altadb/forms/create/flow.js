/**
    Este formulario contiene un control upload para subir archivos,
    con botones de Adjuntar
    Parámetros:
    	Este formulario almacena los archivos en la carpeta
    	resources/files para luego tomar el xls y migrar los datos
    	a postgres
*/
cocoon.load("resource://org/apache/cocoon/forms/flow/javascript/Form.js");

function createform(form) {
    //if (autorizar("cata")) {
        form.showForm("create-form-display");
        
        var formUpload = new Form("forms/create/definition.xml");
	    //formUpload.showForm("upload/uploadForm");
        cocoon.sendPage("migrar");        

       // dialogosino("El archivo ha sido procesado con exito",
       //                 "¿Desea procesar un nuevo archivo?","create", "/bienvenidos");
   // }
}

