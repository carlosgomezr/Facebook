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
    try{
        out.write("entre xD");
        List<FileItem> partes = upload.parseRequest(request);
        
        for(FileItem item : partes){
            File file = new File(ubicacionArchivo,item.getName());
            item.write(file);
        }
        
        out.write("Foto subida correctamente :D ");
        
    }catch(FileUploadException ex){
        out.write("Error al subir foto :( intenta de nuevo :D "+ex.getMessage());
    }
    response.sendRedirect("http://localhost:8080/Facebook/Perfil.jsp");
%>