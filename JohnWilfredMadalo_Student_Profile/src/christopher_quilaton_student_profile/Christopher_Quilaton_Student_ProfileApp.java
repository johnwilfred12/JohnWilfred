/*
 * Christopher_Quilaton_Student_ProfileApp.java
 */

package christopher_quilaton_student_profile;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Christopher_Quilaton_Student_ProfileApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new Christopher_Quilaton_Student_ProfileView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Christopher_Quilaton_Student_ProfileApp
     */
    public static Christopher_Quilaton_Student_ProfileApp getApplication() {
        return Application.getInstance(Christopher_Quilaton_Student_ProfileApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(Christopher_Quilaton_Student_ProfileApp.class, args);
    }
}
