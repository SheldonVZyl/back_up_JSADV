package lesson5;

public class Computer {
    PowerState state;

    public enum PowerState {
        OFF("Power is off"),
        ON("Power usage is high"),
        SUSPEND("Power usage is low");

        public String getDescription() {
            return description;
        }

        private String description;

        private PowerState(String d) {
            description = d;
        }

    }

    public PowerState getState() {
        return state;
    }



    public void setState(PowerState state) {
        this.state = state;
    }
}
