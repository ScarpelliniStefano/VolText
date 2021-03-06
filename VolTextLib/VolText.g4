/**
 * Define a grammar called Hello
 */
grammar VolText;

@header {
    package antlr;
}

// match keyword hello followed by an identifier
pdf : 		A pdfattr* (stylesheet)? (page)+ C;

pdfattr: 	'title:' STRING ENDNLINE
	|		'author:' STRING ENDNLINE
	|		'path:' STRING ENDNLINE;

stylesheet: 'stylesheet' O element* C;
		
element: 	'@' STRING O attrStyle* C;
	
attrStyle: 	'cross-point:' NVAL ENDNLINE
	|		'shape:"' ('RECTANGLE' | 'CIRCLE' | 'TRIANGLE') ENDLINE
	|		('fit-x' | 'fit-y') ':' TFVAL ENDNLINE
	|		('pos-x' | 'pos-y') ':' NOTVAL? NVAL (UNIT)? ENDNLINE
	|		'angle-rotation' ':' NOTVAL? NVAL ENDNLINE
	|		('height' | 'width') ':' NVAL (UNIT)? ENDNLINE
	|		('p_height' | 'p_width') ':' NVAL ENDNLINE
	|		'ordered:' TFVAL ENDNLINE
	|		'bullet:' STRING ENDNLINE
	|		('font-family:' | 'font-family-ttf:' | 'font-family-otf:') STRING ENDNLINE
	| 		'font-size:' NVAL ENDNLINE 
	| 		('bold:' |	'italics:' |'underline:') TFVAL ENDNLINE
	|		'colorT-bullet:' STRING ENDNLINE
	|		'color-bullet:' COLORVAL ENDNLINE
	|		'colorT:' STRING ENDNLINE
	|		'color:' COLORVAL ENDNLINE
	|		'position:' POSVAL ENDNLINE
	|		'alignment:' ALIGNVAL ENDLINE
	|		'orientation:' ORIENTATION ENDNLINE
	|		'oob:' TFVAL ENDNLINE
	|		'format:' FORMATVAL ENDNLINE;
	
page: 		'page' O pageattr* pae* C;

pae: 		elemd | div;

div:		'div' O (color | idval | imganumber | elemd | positionv | fitAttr | figure | tvalue)* C;

tvalue:		'cross-point:' NVAL ENDNLINE;

figure:		'shape:"' ('RECTANGLE' | 'CIRCLE' | 'TRIANGLE') ENDLINE;
	
elemd: 		text 
	| 		list 
	| 		img;
	
img: 		'img' O imgattr* imgElem imgattr* C;

imgattr:	(idval | imganumber | positionv | fitAttr);

imgElem: 	'URL:' STRING ENDNLINE;

list: 		'list' O (listattr | listElem)* C;

listElem: 	'item:' STRING ENDNLINE;

text: 		'text' O (txtattr | txtElem)* txtElem (txtattr | txtElem)* C;

txtattr: 	(color | idval | imganumber | positionv | alignment |  txtval | fitAttr);

txtElem: 	'string:' STRING ENDNLINE;



//ATTRIBUTES

fitAttr:	('fit-x'
		|	 'fit-y') ':' TFVAL ENDNLINE;

imganumber: ('pos-x'
		|	'pos-y' ) ':' NOTVAL? NVAL (UNIT)? ENDNLINE
		|	'angle-rotation' ':' NOTVAL? NVAL ENDNLINE
		|	('height'
		|	'width') ':' NVAL (UNIT)? ENDNLINE;
		
NOTVAL:		'-';
		
UNIT:		'mm' | '%' | 'pt';
		 
idval:		'id:' STRING ENDNLINE;

listattr: 	'ordered:' TFVAL ENDNLINE
	|		'bullet:' STRING ENDNLINE
	|		idval
	|		imganumber
	|		txtval
	|		positionv
	|		color
	|		colorBullet
	|		fitAttr;

txtval:		('font-family:' 
	|		 'font-family-ttf:'
	|		 'font-family-otf:') STRING ENDNLINE
	| 		'font-size:' NVAL ENDNLINE 
	| 		('bold:'
	|		'italics:'
	|		'underline:') TFVAL ENDNLINE;
	
colorBullet:'colorT-bullet:' STRING ENDNLINE
	|		'color-bullet:' COLORVAL ENDNLINE;
	
color:		'colorT:' STRING ENDNLINE
	|		'color:' COLORVAL ENDNLINE;
 
positionv:	'position:' POSVAL ENDNLINE;

alignment:  'alignment:' ALIGNVAL ENDNLINE;

pageattr:	'orientation:' ORIENTATION ENDNLINE
	|		'oob:' TFVAL ENDNLINE
	|		'p_width' ':' NVAL ENDNLINE
	|		'p_height' ':' NVAL ENDNLINE
	|		'format:' FORMATVAL ENDNLINE
	|		idval;
	
FORMATVAL:	'A0'
	|		'A1' 
	|		'A2'
	|		'A3'
	|		'A4'
	|		'A5'
	|		'A6';

ORIENTATION:('hor' | 'ver');
	
//TERMINALI

TXTATF: 	'bold'
	| 		'italics'
	|		'underline';

COLORVAL: 	'#' ([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]([0-9a-fA-F][0-9a-fA-F])*);

ALIGNVAL:    'left'
	|		 'center'
	|		 'right'
	|		 'justify';

TFVAL: 		'true' 
	| 		'false';
	
POSVAL: 	'lt' 
	| 		'ct' 
	| 		'rt' 
	| 		'lc' 
	| 		'cc' 
	| 		'rc' 
	| 		'lb' 
	| 		'cb' 
	| 		'rb' ;

NVAL: 		[0-9]+('.'[0-9]+)?;

ENDLINE: 	'";';
ENDNLINE: 	';';

O : 		':{';
A : 		'{';
C : 		'}';
		
STRING: 	'"' (~[\t\r\n])+ '"';

WS : 		[ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

