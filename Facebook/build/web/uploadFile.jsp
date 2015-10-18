<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.FileUpload"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<% 
    String ubicacionArchivo = "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\Facebook\\web\\photos";
    DiskFileItemFactory factory = new DiskFileItemFactory();
    factory.setSizeThreshold(1024);
    factory.setRepository(new File(ubicacionArchivo));
    ServletFileUpload upload = new ServletFileUpload(factory);
    String aux="";
    try{
        out.write("entre xD");
        List<FileItem> partes = upload.parseRequest(request);
        
        for(FileItem item : partes){
            File file = new File(ubicacionArchivo,item.getName());
            item.write(file);
            aux=item.getName();
        }
        
        out.write("Foto subida correctamente :D ");
        
    }catch(FileUploadException ex){
        out.write("Error al subir foto :( intenta de nuevo :D "+ex.getMessage());
    }
    
%>
<%! String usuarioLog=""; String usuarioPerfil="";%>
   

        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.darUsuarioLog();
	out.println("Usuario = "+result);
        usuarioLog = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>


    <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
       
	java.lang.String foto = aux;
	// TODO process result here
	java.lang.String result = port.asignarPhoto(x, foto);
	out.println("Result = "+result);
        out.println("Variable AUX"+aux);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = usuarioLog;
	java.lang.String contenido = "Cambio su foto de perfil "+aux;
	// TODO process result here
	java.lang.String result = port.agregarHistorial(nombre, contenido);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    response.sendRedirect("http://localhost:8080/Facebook/cambiar.jsp");
    %>
    <%-- end web service invocation --%><hr/>

     