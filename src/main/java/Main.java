import statemachine.PendingStack;
import statemachine.StateStack;
import states.State;

public class Main {
    public static void main(String[] args) {
        // тут пример-пустышка - создаем стейт-машину и начинаем играть со стейтами
        final PendingStack stack = new StateStack();
        stack.pushState(State.StateId.SI_TITLE);
        stack.pushState(State.StateId.SI_SIGNUP);
        stack.update();
        stack.popState();
        stack.pushState(State.StateId.SI_CHARACTER_LIST);
        stack.update();
        stack.clearState();
        stack.update();
    }
}