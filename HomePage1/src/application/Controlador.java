package application;



import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Controlador {
	@FXML
	private Pane p1;
	@FXML
	private Pane p2;
	@FXML
	private Pane p3;
	
	public void initialize() {
		
		
		backgroundAnimation();

	}

	private void backgroundAnimation() {

		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3),
				p1);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();

		fadeTransition
				.setOnFinished(event -> {

					FadeTransition fadeTransition1 = new FadeTransition(
							Duration.seconds(3), p2);
					fadeTransition1.setFromValue(1);
					fadeTransition1.setToValue(0);
					fadeTransition1.play();

					fadeTransition1.setOnFinished(event1 -> {
						FadeTransition fadeTransition2 = new FadeTransition(
								Duration.seconds(3), p2);
						fadeTransition2.setFromValue(1);
						fadeTransition2.setToValue(0);
						fadeTransition2.play();

						fadeTransition2.setOnFinished(event2 -> {

							FadeTransition fadeTransition0 = new FadeTransition(
									Duration.seconds(3), p1);
							fadeTransition0.setFromValue(0);
							fadeTransition0.setToValue(1);
							fadeTransition0.play();

							fadeTransition0.setOnFinished(event3 -> {

								FadeTransition fadeTransition11 = new FadeTransition(
										Duration.seconds(3), p1);

								fadeTransition11.setFromValue(0);
								fadeTransition11.setToValue(1);
								fadeTransition11.play();

						

										backgroundAnimation();
									});

								});
					});
				});


					
	}
}