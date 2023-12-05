// TreePredictorController.java
package TreePredictor;

import java.util.Scanner;

// Controller
public class TreePredictorController {
    private TreePredictorModel model;

    public TreePredictorController(TreePredictorModel model) {
        this.model = model;
    }

    public void startPrediction() {
        try {
            // Train the model with data from the specified URL
            model.trainModel("https://datahub.io/machine-learning/covertype/r/0.html");

            // Accept user input for prediction
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter data for tree type prediction (comma-separated values):");
            String userInput = scanner.nextLine();

            // Make a prediction
            String predictedTreeType = model.predictTreeType(userInput);
            System.out.println("Predicted Tree Type: " + predictedTreeType);

            // Find and display a similar tree type
            String similarTreeType = model.findSimilarTreeType(predictedTreeType);
            System.out.println("Similar Tree Type: " + similarTreeType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
