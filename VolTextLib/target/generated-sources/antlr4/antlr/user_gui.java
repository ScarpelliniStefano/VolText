package antlr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class user_gui {
	/*public static void main(String[] args) throws IOException {
		String str="{\r\n" + 
				"	title: \"prova\";\r\n" + 
				"	page:{\r\n" + 
				"		text:{\r\n" + 
				"			string: \"\\bold ciao \\bold\";\r\n" + 
				"			bold: true;\r\n" + 
				"		}\r\n" + 
				"	}\r\n" + 
				"}";
		generaPDF(str, "");
	}*/
	
	public static List<String> listErrori=new ArrayList<String>();
	public static String global_path;

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
