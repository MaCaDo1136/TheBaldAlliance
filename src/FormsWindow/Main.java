package FormsWindow;

public class Main {

    public static void main(String[] args) {
        FormsAnswers form = new FormsAnswers(null,
                null,
                null,
                null);
        String idString = form.getId();

        form.setId(idString);
    }
}
