package util;

import java.io.*;
import java.util.ArrayList;

import model.ItemBoletim;

public class GenerateBoletim{
     
     public GenerateBoletim(String ra, String nome, String curso, String periodo, String campus) throws IOException {
    	 String fileName = ra+nome;
    	 OutputStream os = new FileOutputStream("/boletins/"+fileName+".html"); // nome do arquivo que será escrito
    	 Writer wr = new OutputStreamWriter(os); // criação de um escritor
    	 BufferedWriter br = new BufferedWriter(wr); // adiciono a um escritor de buffer
  
    	 
    	 //itemBoletim
    	 
    	 
    	 ArrayList<ItemBoletim> semester1 = new ArrayList<ItemBoletim>();
    	 ArrayList<ItemBoletim> semester2 = new ArrayList<ItemBoletim>();
    	 ArrayList<ItemBoletim> semester3 = new ArrayList<ItemBoletim>();
    	 ArrayList<ItemBoletim> semester4 = new ArrayList<ItemBoletim>();
    	 ArrayList<ItemBoletim> semester5 = new ArrayList<ItemBoletim>();
    	 ArrayList<ItemBoletim> semester6 = new ArrayList<ItemBoletim>();
    	 
	     br.write(header());
	     
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
	     
	     br.write("<div class=\"semester\">\r\n"
	     		+ "   <div class=\"semester-header\">\r\n"
	     		+ "     <span>1 Semestre</span>\r\n"
	     		+ "   </div>\r\n"
	     		+ "     <div class=\"semester-list\">\r\n"
	     		+ "\r\n"    //materia aqui
	     		+ "   </div>\r\n"
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

