package example.thread;

public class ToDo {
    private Boolean solvedProblem;
    private Boolean readBook;

    public ToDo(Boolean solvedProblem, Boolean readBook) {
        this.solvedProblem = solvedProblem;
        this.readBook = readBook;
    }

    public Boolean getSolvedProblem() {
        return solvedProblem;
    }

    public void setSolvedProblem(Boolean solvedProblem) {
        this.solvedProblem = solvedProblem;
    }

    public Boolean getReadBook() {
        return readBook;
    }

    public void setReadBook(Boolean readBook) {
        this.readBook = readBook;
    }
}
