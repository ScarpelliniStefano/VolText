package antlr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class user_gui {
	public static void main(String[] args) throws IOException {
		String str="{\r\n" + 
				"	title:\"Test\";\r\n" + 
				"	page:{\r\n" + 
				"		p_width:100;\r\n" + 
				"		p_height:100;\r\n" + 
				"		div:{\r\n" + 
				"			id:\"A\";\r\n" + 
				"			shape:\"CIRCLE\";\r\n" + 
				"			color:#482A4822;\r\n" + 
				"			width:50mm;\r\n" + 
				"			height:50mm;\r\n" + 
				"			pos-x:100;\r\n" + 
				"			pos-y:100;\r\n" + 
				"			position:cc;\r\n" + 
				"			fit-x:true;\r\n" + 
				"			angle-rotation:56;\r\n" + 
				"		}\r\n" + 
				"		div:{\r\n" + 
				"			id:\"B\";\r\n" + 
				"			position:lc;\r\n" + 
				"			color:#58184544;\r\n" + 
				"			width:50mm;\r\n" + 
				"			height:50mm;\r\n" + 
				"			pos-x:60%;\r\n" + 
				"			pos-y:60%;\r\n" + 
				"			fit-y:true;\r\n" + 
				"		}\r\n" + 
				"		text:{\r\n" + 
				"				id:\"TESTO2\";\r\n" + 
				"				colorT:\"black\";\r\n" + 
				"				position:ct;\r\n" + 
				"				height:30mm;\r\n" + 
				"				string:\"Prova\";\r\n" + 
				"				angle-rotation: 45;\r\n" + 
				"		}\r\n" + 
				"	}	\r\n" + 
				"}\r\n" ;
		generaPDF(str,"");
	}
	
	public static List<String> listErrori=new ArrayList<String>();
	public static String global_path = "";

	public static List<String> generaPDF(String grammar, String p) throws IOException {
		global_path = p;
		// TODO Auto-generated method stub
		CharStream codePointCharStream = CharStreams.fromString(grammar);
		//ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("doc.txt") );
	    listErrori=new ArrayList<String>();
		VolTextLexer lexer = new VolTextLexer(codePointCharStream);
		lexer.removeErrorListeners();
		lexer.addErrorListener(VoltextErrorListener.INSTANCE);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		VolTextParser parser = new VolTextParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(VoltextErrorListener.INSTANCE);
		ParseTree tree = parser.pdf(); // begin parsing at rule 'r'
		VolTEXT_Listener vtbl = new VolTEXT_Listener();
		ParseTreeWalker ptw = new ParseTreeWalker();
		ptw.walk(vtbl, tree);
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		return listErrori;
		
	}

}
