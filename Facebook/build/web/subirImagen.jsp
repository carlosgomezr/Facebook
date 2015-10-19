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
<%! String usuarioLog=""; String usuarioPerfil=""; String titulo1="Titulo"; String texto1="Imagen :D";%>
<%
            
%>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.darUsuarioLog();
	out.println("Result = "+result);
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
	// TODO process result here
	java.lang.String result = port.darUsuarioPerfil();
	out.println("Result = "+result);
        usuarioPerfil = result;
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
	java.lang.String contenido = "Publicó "+aux;
	// TODO process result here
	java.lang.String result = port.agregarHistorial(nombre, contenido);
	out.println("Result = "+result);
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
	java.lang.String correo = usuarioLog;
	java.lang.String titulo = titulo1;
	java.lang.String publicador = usuarioLog;
	java.lang.String texto = texto1;
	java.lang.String imagen = aux;
        out.println(usuarioLog+"  "+titulo1+"  "+texto1);
	java.lang.String result = port.agregarPublicacion(x, correo, titulo, publicador, texto, imagen);
	out.println("Result = "+result);
         response.sendRedirect("http://localhost:8080/Facebook/Perfil.jsp");
 
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
