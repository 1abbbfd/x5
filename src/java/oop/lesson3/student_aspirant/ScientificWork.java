package oop.lesson3.student_aspirant;

public class ScientificWork {
    private String topic;
    private String text;

    public ScientificWork(String topic, String text) {
        this.topic = topic;
        this.text = text;
    }

    public String getTopic() {
        return topic;
    }

    public String getText() {
        return text;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setText(String text) {
        this.text = text;
    }
}
