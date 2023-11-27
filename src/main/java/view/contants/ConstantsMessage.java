package view.contants;

public enum ConstantsMessage {
    START_MESSAGE("재미있는 15 퍼즐!"),
    TURN_COUNT_MESSAGE("Turn %d"),
    FINISH_MESSAGE("축하합니다! %d턴만에 퍼즐을 완성했습니다!"),
    INPUT_MESSAGE("숫자 입력> "),
    EMPTY_PARENTHESIS_MESSAGE("[  ]"),
    PARENTHESIS_MESSAGE("[%2d]");

    private final String message;

    ConstantsMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
