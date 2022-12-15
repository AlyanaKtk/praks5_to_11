package pr10;

public class student
{
    String name;
    String surname;
    int course;
    String speciality;
    int score;
    int id;
    String group;
    public student() {
        this.id = 100000 + (int) (Math.random() * 100000);
        this.score = (int) (Math.random() * 120);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGroup() {
        return group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSurname() {
        return surname;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "score: " + this.score + ", id: " + this.id;
    }
}
