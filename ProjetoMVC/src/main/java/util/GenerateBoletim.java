package util;

import java.io.*;
import java.util.ArrayList;

import dao.DisciplinaDao;
import model.Disciplina;
import model.ItemBoletim;

public class GenerateBoletim{
     
     public GenerateBoletim(String ra, String nome, String curso, String periodo, String campus, ArrayList<ItemBoletim> itens) throws Exception {
    	 String fileName = ra+nome;
    	 OutputStream os = new FileOutputStream("/boletins/"+fileName+".html"); // nome do arquivo que será escrito
    	 Writer wr = new OutputStreamWriter(os); // criação de um escritor
    	 BufferedWriter br = new BufferedWriter(wr); // adiciono a um escritor de buffer
    	 
    	 DisciplinaDao dao = new DisciplinaDao();
    	 
    	 ArrayList<Disciplina> diciplinas = dao.getDisciplinas(curso);

    	 //itemBoletim
    	 
    	 ArrayList<String> semester1 = new ArrayList<String>();
    	 ArrayList<String> semester2 = new ArrayList<String>();
    	 ArrayList<String> semester3 = new ArrayList<String>();
    	 ArrayList<String> semester4 = new ArrayList<String>();
    	 ArrayList<String> semester5 = new ArrayList<String>();
    	 ArrayList<String> semester6 = new ArrayList<String>();
    	 
    	 for(Disciplina disciplina : diciplinas) {
    		 for(ItemBoletim item : itens) {
    			if(item.getIdDiciplina() == disciplina.getId() && disciplina.getSemestre() == 1) {
    				 semester1.add("<div class=\"materia\">\r\n"
    			    	 		+ "  <span class=\"materia-name\">"+ disciplina.getNome()+"</span>\r\n"
    			    	 		+ "  <div>\r\n"
    			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Nota:</span><span>"+item.getNota()+"/</span></div>\r\n"
    			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Faltas:</span><span>"+item.getFaltas()+"</span></div>\r\n"
    			    	 		+ "  </div>\r\n"
    			    	 		+ "</div>");
    			}
    			if(item.getIdDiciplina() == disciplina.getId() && disciplina.getSemestre() == 2) {
    				semester2.add("<div class=\"materia\">\r\n"
			    	 		+ "  <span class=\"materia-name\">"+ disciplina.getNome()+"</span>\r\n"
			    	 		+ "  <div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Nota:</span><span>"+item.getNota()+"/</span></div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Faltas:</span><span>"+item.getFaltas()+"</span></div>\r\n"
			    	 		+ "  </div>\r\n"
			    	 		+ "</div>");
    			}
    			if(item.getIdDiciplina() == disciplina.getId() && disciplina.getSemestre() == 3) {
    				semester3.add("<div class=\"materia\">\r\n"
			    	 		+ "  <span class=\"materia-name\">"+ disciplina.getNome()+"</span>\r\n"
			    	 		+ "  <div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Nota:</span><span>"+item.getNota()+"/</span></div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Faltas:</span><span>"+item.getFaltas()+"</span></div>\r\n"
			    	 		+ "  </div>\r\n"
			    	 		+ "</div>");
    			}
    			if(item.getIdDiciplina() == disciplina.getId() && disciplina.getSemestre() == 4) {
    				semester4.add("<div class=\"materia\">\r\n"
			    	 		+ "  <span class=\"materia-name\">"+ disciplina.getNome()+"</span>\r\n"
			    	 		+ "  <div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Nota:</span><span>"+item.getNota()+"/</span></div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Faltas:</span><span>"+item.getFaltas()+"</span></div>\r\n"
			    	 		+ "  </div>\r\n"
			    	 		+ "</div>");
    			}
   				if(item.getIdDiciplina() == disciplina.getId() && disciplina.getSemestre() == 5) {
   					semester5.add("<div class=\"materia\">\r\n"
			    	 		+ "  <span class=\"materia-name\">"+ disciplina.getNome()+"</span>\r\n"
			    	 		+ "  <div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Nota:</span><span>"+item.getNota()+"/</span></div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Faltas:</span><span>"+item.getFaltas()+"</span></div>\r\n"
			    	 		+ "  </div>\r\n"
			    	 		+ "</div>");
   				}
   				if(item.getIdDiciplina() == disciplina.getId() && disciplina.getSemestre() == 6) {
   					semester6.add("<div class=\"materia\">\r\n"
			    	 		+ "  <span class=\"materia-name\">"+ disciplina.getNome()+"</span>\r\n"
			    	 		+ "  <div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Nota:</span><span>"+item.getNota()+"/</span></div>\r\n"
			    	 		+ "     <div class=\"materia-item\"><span class=\"subtitle\">Faltas:</span><span>"+item.getFaltas()+"</span></div>\r\n"
			    	 		+ "  </div>\r\n"
			    	 		+ "</div>");	 
    			}
    		 }
    	 }
    	 
    	 
	     br.write(header());
	     
	     //alunos infos
	     br.write("<div class=\"alunoInfos\">\r\n"
	     		+ "        <div class=\"imageContainer\">\r\n"
	     		+ "\r\n"
	     		+ "        </div>\r\n"
	     		+ "        <div class=\"infos\">\r\n"
	     		+ "            <span class=\"ra\">"+ ra +"</span>\r\n"
	     		+ "            <h1 class=\"nome\">"+ nome +"</h1>\r\n"
	     		+ "            <span class=\"curso\">"+ curso +"</span> \r\n"
	     		+ "            <div class=\"campus\">\r\n"
	     		+ "                <span>"+ campus +"</span> - <span>"+ periodo +"</span>\r\n"
	     		+ "            </div>\r\n"
	     		+ "        </div>\r\n"
	     		+ "    </div>");
	     
	     br.write(" <div class=\"notas\">\r\n"
	     		+ "        <div class=\"table\">");
	     //1semestre
	     br.write("<div class=\"semester\">\r\n"
	     		+ "   <div class=\"semester-header\">\r\n"
	     		+ "     <span>1 Semestre</span>\r\n"
	     		+ "   </div>\r\n"
	     		+ "     <div class=\"semester-list\">\r\n");
	     		
	     for(String item:semester1) {
	    	 br.write(item);
	     } 
	     br.write("  </div>\r\n"
	     		+ "</div>");
	     
	   //2semestre
	     br.write("<div class=\"semester\">\r\n"
	     		+ "   <div class=\"semester-header\">\r\n"
	     		+ "     <span>2 Semestre</span>\r\n"
	     		+ "   </div>\r\n"
	     		+ "     <div class=\"semester-list\">\r\n");
	     		
	     for(String item:semester2) {
	    	 br.write(item);
	     } 
	     br.write("  </div>\r\n"
	     		+ "</div>");
	     
	   //3semestre
	     br.write("<div class=\"semester\">\r\n"
	     		+ "   <div class=\"semester-header\">\r\n"
	     		+ "     <span>3 Semestre</span>\r\n"
	     		+ "   </div>\r\n"
	     		+ "     <div class=\"semester-list\">\r\n");
	     		
	     for(String item:semester3) {
	    	 br.write(item);
	     } 
	     br.write("  </div>\r\n"
	     		+ "</div>");
	     
	   //4semestre
	     br.write("<div class=\"semester\">\r\n"
	     		+ "   <div class=\"semester-header\">\r\n"
	     		+ "     <span>4 Semestre</span>\r\n"
	     		+ "   </div>\r\n"
	     		+ "     <div class=\"semester-list\">\r\n");
	     		
	     for(String item:semester4) {
	    	 br.write(item);
	     } 
	     br.write("  </div>\r\n"
	     		+ "</div>");
	     
	   //5semestre
	     br.write("<div class=\"semester\">\r\n"
	     		+ "   <div class=\"semester-header\">\r\n"
	     		+ "     <span>5 Semestre</span>\r\n"
	     		+ "   </div>\r\n"
	     		+ "     <div class=\"semester-list\">\r\n");
	     		
	     for(String item:semester5) {
	    	 br.write(item);
	     } 
	     br.write("  </div>\r\n"
	     		+ "</div>");
	     
	   //1semestre
	     br.write("<div class=\"semester\">\r\n"
	     		+ "   <div class=\"semester-header\">\r\n"
	     		+ "     <span>6 Semestre</span>\r\n"
	     		+ "   </div>\r\n"
	     		+ "     <div class=\"semester-list\">\r\n");
	     		
	     for(String item:semester6) {
	    	 br.write(item);
	     } 
	     br.write("  </div>\r\n"
	     		+ "</div>");
	     
	     
	     br.write(end());
	     br.close();
     }
     
     public String header() {
    	 return("<!DOCTYPE html>\r\n"
 	     		+ "<html lang=\"pt-br\">\r\n"
 	     		+ "<head>\r\n"
 	     		+ "    <meta charset=\"UTF-8\">\r\n"
 	     		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
 	     		+ "    <title>Boletim</title>\r\n"
 	     		+ "\r\n"
 	     		+ "    <style>\r\n"
 	     		+ "        *{\r\n"
 	     		+ "            font-family: sans-serif;\r\n"
 	     		+ "            margin: 0;\r\n"
 	     		+ "            padding: 0;\r\n"
 	     		+ "        }\r\n"
 	     		+ "        .alunoInfos{\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "            padding: 5rem;\r\n"
 	     		+ "        }\r\n"
 	     		+ "        .imageContainer{\r\n"
 	     		+ "            width: 10rem;\r\n"
 	     		+ "            height: 10rem;\r\n"
 	     		+ "            background-color: aqua;\r\n"
 	     		+ "        }\r\n"
 	     		+ "        .infos{\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "            padding: 1rem;\r\n"
 	     		+ "            flex-direction: column;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .ra{\r\n"
 	     		+ "            font-size: 1rem;\r\n"
 	     		+ "            padding-left: 10px;\r\n"
 	     		+ "            padding-top: 10px;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .nome{\r\n"
 	     		+ "            font-size: 2.4rem;\r\n"
 	     		+ "            height: 2.4rem;\r\n"
 	     		+ "            padding-left: 10px;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .curso{\r\n"
 	     		+ "            padding-left: 10px;\r\n"
 	     		+ "            padding-top: 10px;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .campus{\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "            padding: 10px;\r\n"
 	     		+ "            font-weight: bold;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .notas{\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "            justify-content: center;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .table{\r\n"
 	     		+ "            width: 84%;\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .semester{\r\n"
 	     		+ "            width: 14%;\r\n"
 	     		+ "            border: 1px solid black;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .semester-header{\r\n"
 	     		+ "            height: 2rem;\r\n"
 	     		+ "            background-color: black;\r\n"
 	     		+ "            color: white;\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "            justify-content: center;\r\n"
 	     		+ "            align-items: center;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .semester-list{\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "            flex-direction: column;\r\n"
 	     		+ "            align-items: center;\r\n"
 	     		+ "            padding: 10px;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .materia{\r\n"
 	     		+ "            width: 90%;\r\n"
 	     		+ "            height: 7rem;\r\n"
 	     		+ "\r\n"
 	     		+ "            border-radius: 10px;\r\n"
 	     		+ "\r\n"
 	     		+ "            background-color: rgb(245, 245, 245);\r\n"
 	     		+ "\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "            flex-direction: column;\r\n"
 	     		+ "            justify-content: space-between;\r\n"
 	     		+ "\r\n"
 	     		+ "            padding: 8px;\r\n"
 	     		+ "            margin-bottom: 5px;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .materia-item{\r\n"
 	     		+ "            display: flex;\r\n"
 	     		+ "            justify-content: space-between;\r\n"
 	     		+ "\r\n"
 	     		+ "            font-size: 10pt;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .materia-name{\r\n"
 	     		+ "            font-size: 11pt;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "        .subtitle{\r\n"
 	     		+ "            font-weight: bold;\r\n"
 	     		+ "        }\r\n"
 	     		+ "\r\n"
 	     		+ "    </style>\r\n"
 	     		+ "\r\n"
 	     		+ "</head>");
    			 
     }
     
     public String end() {
    	 return (
    			 "   </div>\r\n"
    			     		+ "    </div>"
    			    		+"</body>\r\n"
    			     		+ "</html>" 
    	);
     }
}

