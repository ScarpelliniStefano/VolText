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
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Main extends Application {

	String currdirCart="";
	Integer rowNumber=0;
	
	/**
	 * Crea un'interfaccia a livello manuale per il programma.
	 */
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
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        HBox hboxTextArea=new HBox(0);
        hboxTextArea.setAlignment(Pos.CENTER);
               
        TextArea rowTextArea = new TextArea();
        double rWidth = 60;
        double rHeight = 600;
        rowTextArea.setId("line");
        rowTextArea.setMinWidth(rWidth);
        rowTextArea.setPrefSize(rWidth, rHeight);
        rowTextArea.setEditable(false);
        rowTextArea.setMouseTransparent(true);
        rowTextArea.setFocusTraversable(false);
        hboxTextArea.getChildren().add(rowTextArea);
        rowTextArea.setText("");
        
        TextArea userTextArea = new TextArea();
        double prefWidth = 1000;
        double prefHeight = 600;
        userTextArea.setPrefSize(prefWidth, prefHeight);
        userTextArea.setId("textarea_main");
        hboxTextArea.getChildren().add(userTextArea);
        userTextArea.setOnScroll(new EventHandler<ScrollEvent>() {

			@Override
			public void handle(ScrollEvent arg0) {
				// TODO Auto-generated method stub
				rowTextArea.positionCaret(userTextArea.getCaretPosition());
			}
        	
        });
        userTextArea.applyCss();
   
        grid.add(hboxTextArea, 1, 1);
        
        Button btnApri = new Button("Open...");
        btnApri.setPrefSize(140,50);
        btnApri.setId("bApri");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btnApri);

        Button btnSalva = new Button("Save...");
        btnSalva.setPrefSize(140,50);
        btnSalva.setId("bSalva");
        hbBtn.getChildren().add(btnSalva);

        Button btnCrea = new Button("Create");
        btnCrea.setId("bCrea");
        btnCrea.setPrefSize(140,50);
        hbBtn.getChildren().add(btnCrea);
        grid.add(hbBtn, 1, 4);

        TextArea consoleTextArea = new TextArea();
        consoleTextArea.setId("consoleTextArea");
        consoleTextArea.setPrefSize(prefWidth, 300);
        consoleTextArea.setEditable(false);
        consoleTextArea.setText("");
        grid.add(consoleTextArea, 1, 7);

        System.out.println(userTextArea.getScrollTop());
        
        userTextArea.textProperty().addListener(new ChangeListener<String>() {
            public void changed(final ObservableValue<? extends String> observable, final String oldValue, final String newValue) {
            		
            	
            	
            	ScrollBar vertScrollBar = (ScrollBar) userTextArea.lookup(".scroll-bar:vertical");
            	
            	
            	ScrollBar rowVertScrollBar = (ScrollBar) rowTextArea.lookup(".scroll-bar:vertical");

            	ScrollBar rowHorizScrollBar = (ScrollBar) rowTextArea.lookup(".scroll-bar:horizontal");
            	rowVertScrollBar.setOpacity(1);
            	rowVertScrollBar.setVisible(false);
            	rowVertScrollBar.applyCss();
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

        btnApri.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Apri");
                try {
                	if(currdirCart=="")
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
		
                File selectedFile =null;
                selectedFile=fileChooser.showOpenDialog(primaryStage);
                if(selectedFile!=null) {
                	try {
                		currdirCart = selectedFile.getParent().toString() + "/";
                		currdirCart=currdirCart.replace("\\", "/");

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
                }
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
					e1.printStackTrace();
				}

		 		// Set extension filter
         		FileChooser.ExtensionFilter extFilter = 
         						new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
         		fileChooser.getExtensionFilters().add(extFilter);
                File fileToSave = fileChooser.showSaveDialog(primaryStage);
                if(fileToSave!=null) {
                    try {
                        FileWriter myWriter = new FileWriter(fileToSave);
                        myWriter.write(userTextArea.getText());
                        myWriter.close();
                        msg("File salvato", consoleTextArea, false);
                    } catch (IOException exc) {
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
					errors=user_gui.generaPDF(grammatica, currdirCart);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                msg("",consoleTextArea,false);
                Boolean criticalErrors=false;
                for(String msg:errors) {
                	if(msg.contains("Impossibile accedere al file. Il file ? utilizzato da un altro processo")
                			| msg.contains("Impossibile trovare il percorso specificato"))
                		criticalErrors=true;
                	msgAdd(msg, consoleTextArea);
                }
                if(!criticalErrors)
                	msgAdd("PDF GENERATO!",consoleTextArea);
                		
            }
        });

        Scene scene = new Scene(grid, 700, 700);  
       
        
        //try {
			//scene.getStylesheets().add(new File(.toURI()).toURI().toURL().toString());
		scene.getStylesheets().add(getClass().getClassLoader().getResource("application.css").toExternalForm());
		//} catch (URISyntaxException | IOException e1) {
		//	e1.printStackTrace();
		//}
        primaryStage.setScene(scene);
        primaryStage.show();

        Region region = ( Region ) consoleTextArea.lookup( ".content" );
        region.setStyle( "-fx-background-color: #272326;" );

    }


    public static void main(String[] args) {
        launch(args);
    }

    public void msg(String s, TextArea a,boolean bad)
    {
    	if(bad) {
    		a.setStyle("-fx-text-fill: red;");
    	}else {
    		a.setStyle("-fx-text-fill: wheat;");
    	}
        a.setText(s);
    }
    
    public void msgAdd(String s, TextArea a)
    {
        a.appendText(s+System.lineSeparator());
    }
}
