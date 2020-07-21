package com.game.room;

public enum ClassName {
        JAVA("JAVA"),
        JAVASCRIPT("JAVASCRIPT"),
        ALGORITHM("ALGORITHM"),
        LINUX("LINUX"),
        PYTHON("PYTHON"),
        CAPSTONE("CAPSTONE"),
        BREAKOUT("BREAKOUT"),
        LOBBY("LOBBY");

        private String value;

        ClassName(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }

}
