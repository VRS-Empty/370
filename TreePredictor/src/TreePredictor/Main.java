// Main.java
package TreePredictor;

public class Main {
    public static void main(String[] args) {
        // Create the model, controller, and view
        TreePredictorModel model = new TreePredictorModel();
        TreePredictorController controller = new TreePredictorController(model);

        // Start the prediction process
        controller.startPrediction();
    }
}
