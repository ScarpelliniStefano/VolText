package VolTEXTFX;
	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import antlr.user_gui;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application {

String currdir=""; 
String currdirCart="";
Integer rowNumber=0;
	@Override
    public void start(Stage primaryStage) {
		
        primaryStage.setTitle("VolText");
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(400);
        primaryStage.setMaxWidth(1200);
        primaryStage.setMaxHeight(900);
        primaryStage.getIcons().add(new Image("file:Icon.png"));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        //grid.setStyle("-fx-background-color: #2e3534; -fx-text-fill: white;");

        Text scenetitle = new Text("VolText");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 1, 0, 1, 1);
        
        GridPane gridInterna=new GridPane();
        
        TextArea rowTextArea = new TextArea();
        double rWidth = 50;
        double rHeight = 600;
        rowTextArea.setMinWidth(rWidth);
        rowTextArea.setPrefSize(rWidth, rHeight);
        //rowTextArea.setDisable(true);
        rowTextArea.setEditable(false);
        rowTextArea.setStyle(" -fx-vbar-policy: never;  -fx-padding:0; ");
        rowTextArea.setMouseTransparent(true);
        rowTextArea.setFocusTraversable(false);
        rowTextArea.applyCss();
        gridInterna.add(rowTextArea, 0, 1);
        rowTextArea.setText("");
        
        TextArea userTextArea = new TextArea();

        double prefWidth = 1000;
        double prefHeight = 600;
        userTextArea.setPrefSize(prefWidth, prefHeight);
        //userTextArea.setStyle(" -fx-vbar-policy: never;  -fx-padding:0; ");
        //userTextArea.setMaxSize(3*prefWidth, 3*prefHeight);
        gridInterna.add(userTextArea, 1, 1);
        //HBox textBox=new HBox();
        //textBox.getChildren().addAll(rowTextArea,userTextArea);
        //ScrollPane panelSUser=new ScrollPane();
        //panelSUser.setContent(textBox);
        //panelSUser.setFitToWidth(true);
        userTextArea.setOnScroll(new EventHandler<ScrollEvent>() {

			@Override
			public void handle(ScrollEvent arg0) {
				// TODO Auto-generated method stub
				rowTextArea.positionCaret(userTextArea.getCaretPosition());
			}
        	
        });
   
        grid.add(gridInterna, 1, 1);
        
        Button btnApri = new Button("Apri grammatica");
        btnApri.setPrefSize(140,50);
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btnApri);
        grid.add(hbBtn, 1, 4);

        Button btnSalva = new Button("Salva grammatica");
        btnSalva.setPrefSize(140,50);
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.CENTER);
        hbBtn2.getChildren().add(btnSalva);
        grid.add(hbBtn2, 1, 5);

        Button btnCrea = new Button("Crea PDF");
        btnCrea.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-border-color: darkgreen; -fx-border-width: 2px; -fx-font-size: 1em;");
        btnCrea.setPrefSize(100,75);
        HBox hbBtn3 = new HBox(10);
        hbBtn3.setAlignment(Pos.CENTER);
        hbBtn3.getChildren().add(btnCrea);
        grid.add(hbBtn3, 1, 6);

        TextArea consoleTextArea = new TextArea();
        consoleTextArea.setPrefSize(prefWidth, 300);
        consoleTextArea.setEditable(false);
        consoleTextArea.setStyle(" -fx-highlight-fill: lightgrey; -fx-highlight-text-fill: black; -fx-text-fill: wheat; ");
        consoleTextArea.setText("");
        grid.add(consoleTextArea, 1, 7);

        System.out.println(userTextArea.getScrollTop());
        
        
       
        
//        userTextArea.textProperty().addListener(new ChangeListener<String>() {           
//
//			@Override
//			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//				int numL=(int) newValue.lines().count();
//				if(rowNumber<numL) {
//					rowNumber=numL;
//					rowTextArea.appendText(rowNumber.toString()+System.lineSeparator());
//					
//				}else if(rowNumber>numL) {
//					rowNumber=numL;
//					rowTextArea.setText("");
//					for(int i=1;i<=rowNumber;i++) {
//						rowTextArea.appendText(i+System.lineSeparator());
//					}
//					
//					
//				}
//				
//				 // TODO Auto-generated method stub
//                ScrollBar vertScrollBar = (ScrollBar) userTextArea.lookup(".scroll-bar:vertical");
//                //ScrollBar horizScrollBar = (ScrollBar) userTextArea.lookup(".scroll-bar:horizontal");
//                //System.out.println(vertScrollBar + " " + horizScrollBar);
//                if(vertScrollBar.getValue() == 1)
//                {
//                	vertScrollBar.valueProperty().addListener(new ChangeListener<Number>() {
//
//                        @Override
//                        public void changed(ObservableValue<? extends Number> arg0, Number oldV, Number newV) {
//                            // TODO Auto-generated method stub
//                        	System.out.println((int)(newV.doubleValue()*rowNumber));
//                            //System.out.println(newV);
//                        }
//                    });
//
//
//                    /*vertScrollBar.setOnScroll(new EventHandler<ScrollEvent>() {
//
//                       @Override
//                       public void handle(ScrollEvent arg0) {
//                           // TODO Auto-generated method stub
//                           System.out.println(vertScrollBar.getValue());
//                       }
//                   });*/
//                }
//                else
//                {
//                    //System.out.println("nessuna ScrollBar presente.");
//                }
//					
//			}
//        });
        
        userTextArea.textProperty().addListener(new ChangeListener<String>() {
            public void changed(final ObservableValue<? extends String> observable, final String oldValue, final String newValue) {
            		
            	
            	
            	ScrollBar vertScrollBar = (ScrollBar) userTextArea.lookup(".scroll-bar:vertical");
            	
            	
            	ScrollBar rowVertScrollBar = (ScrollBar) rowTextArea.lookup(".scroll-bar:vertical");

            	ScrollBar rowHorizScrollBar = (ScrollBar) rowTextArea.lookup(".scroll-bar:horizontal");
            	rowVertScrollBar.setVisible(false);
            	rowVertScrollBar.setOpacity(0);
            	rowHorizScrollBar.setVisible(false);

            	int numL=(int) newValue.lines().count();
				if(rowNumber<numL) {
					rowNumber=numL;
					rowTextArea.appendText(rowNumber.toString()+System.lineSeparator());
					
				}else if(rowNumber>numL) {
					rowNumber=numL;
					rowTextArea.setText("");
					for(int i=1;i<=rowNumber;i++) {
						rowTextArea.appendText(i+System.lineSeparator());
					}
					
					
				}
            	
            	vertScrollBar.valueProperty().addListener(new ChangeListener<Number>() {

                    @Override
                    public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                        // TODO Auto-generated method stub
                    	
                    	rowTextArea.setScrollTop(userTextArea.getScrollTop());
                    }
                });
            	
            	
            	
            	rowTextArea.setScrollTop(userTextArea.getScrollTop());
            }
        });
        
        
        userTextArea.textProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String old, String nuevo) {
                

            	rowTextArea.setScrollTop(userTextArea.getScrollTop());
            }
        });
        
//       
        
        btnApri.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Apri");
                try {
                	if(currdir=="")
                		fileChooser.setInitialDirectory(new File((new File(".").getCanonicalPath())));
                	else {
                		String s=currdirCart;
                		File fileDir=new File(s);
                		fileChooser.setInitialDirectory(fileDir);
                	}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}    
                
                // Set extension filter
         		FileChooser.ExtensionFilter extFilter = 
         						new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
         		fileChooser.getExtensionFilters().add(extFilter);
		
                //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                //int result = fileChooser.showOpenDialog(null);
                //if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile =null;
                selectedFile=fileChooser.showOpenDialog(primaryStage);
                if(selectedFile!=null) {
                	try {
                		currdirCart = selectedFile.getParent();
                		currdir = selectedFile.getCanonicalPath().toString() + "/";
                		currdir=currdir.replace("\\", "/");

                        Scanner myReader = new Scanner(selectedFile);
                        rowNumber=0;
                        userTextArea.setText("");
                        
                        rowTextArea.setText("");
                        while (myReader.hasNextLine()) {
                            userTextArea.appendText(myReader.nextLine() + System.lineSeparator());
                        }
                        myReader.close();
                        rowTextArea.setMinHeight(userTextArea.getHeight());


                        msg("File aperto", consoleTextArea, false);

                    } catch (IOException exc) {
                        msg("Errore: " + exc.getMessage(), consoleTextArea, true);
                        exc.printStackTrace();
                    }

                }
                else
                {
                    msg("File non valido!", consoleTextArea, true);
                    //JOptionPane.showMessageDialog(null,"File non valido!");
                }
                
                //rowTextArea.setScrollTop(Integer.MIN_VALUE);

            }
        });


        btnSalva.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                if(userTextArea.getText().trim().equals(""))
                {
                    msg("Grammatica vuota!", consoleTextArea, true);
                    return;
                }

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Salva");
		    
		 try {
					fileChooser.setInitialDirectory(new File((new File(".").getCanonicalPath())));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

                //int userSelection = fileChooser.showSaveDialog(null);
		 		// Set extension filter
         		FileChooser.ExtensionFilter extFilter = 
         						new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
         		fileChooser.getExtensionFilters().add(extFilter);
		 		//if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.showSaveDialog(primaryStage);
                if(fileToSave!=null) {
                    try {
                        FileWriter myWriter = new FileWriter(fileToSave);
                        myWriter.write(userTextArea.getText());
                        myWriter.close();
                        //JOptionPane.showMessageDialog(null,"File salvato");
                        msg("File salvato", consoleTextArea, false);
                    } catch (IOException exc) {
                        //JOptionPane.showMessageDialog(null,"Errore: " + exc.getMessage());
                        msg("Errore: " + exc.getMessage(), consoleTextArea, true);
                        exc.printStackTrace();
                    }

                }
                else
                {
                    msg("Selezione non valida", consoleTextArea, true);
                }
            }
        });


        btnCrea.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
            	msg("Creando il PDF", consoleTextArea, false);
            	if(userTextArea.getText().trim().equals(""))
                {
                    msg("Grammatica vuota!", consoleTextArea, true);
                    return;
                }
               
                String grammatica = userTextArea.getText();
                List<String> errors=new ArrayList<String>();
                
                
                try {
					errors=user_gui.generaPDF(grammatica, currdir);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                msg("",consoleTextArea,false);
                for(String msg:errors) {
                	msgAdd(msg, consoleTextArea);
                }
                msgAdd("PDF GENERATO!",consoleTextArea);
                		
            }
        });

        Scene scene = new Scene(grid, 700, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        

        Region region = ( Region ) consoleTextArea.lookup( ".content" );
        region.setStyle( "-fx-background-color: #272326;" );

//        Region region2 = ( Region ) userTextArea.lookup( ".content" );
//        region2.setStyle( "-fx-background-color: #272326;" );

    }


    public static void main(String[] args) {
        launch(args);
    }


    public void msg(String s, TextArea a,boolean bad)
    {
    	if(bad) {
    		a.setStyle(" -fx-highlight-fill: lightgrey; -fx-highlight-text-fill: black; -fx-text-fill: red; ");
    	}
        a.setText(s);
    }
    public void msgAdd(String s, TextArea a)
    {
        a.appendText(s+System.lineSeparator());
    }
}
