public class Trainer {
    // 1. PRIVATE FIELDS (minimum 4)
    private int trainerId;
    private String name;
    private String specialization;
    private int experienceYears;
    private boolean isCertified;
    private double hourlyRate;

    // 2. CONSTRUCTOR WITH PARAMETERS
    public Trainer(int trainerId, String name, String specialization, int experienceYears, boolean isCertified, double hourlyRate) {
        this.trainerId = trainerId;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.isCertified = isCertified;
        this.hourlyRate = hourlyRate;
    }

    // 3. DEFAULT CONSTRUCTOR
    public Trainer() {
        this.trainerId = 0;
        this.name = "Unknown Trainer";
        this.specialization = "General Fitness";
        this.experienceYears = 0;
        this.isCertified = false;
        this.hourlyRate = 5000.0;
    }

    // 4. GETTERS
    public int getTrainerId() {
        return trainerId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public boolean isCertified() {
        return isCertified;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // 5. SETTERS
    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setCertified(boolean certified) {
        isCertified = certified;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // 6. ADDITIONAL METHODS (minimum 2)

    // Method 1: Check if trainer is experienced
    public boolean isExperienced() {
        return experienceYears >= 5;
    }

    // Method 2: Calculate session cost
    public double calculateSessionCost(int hours) {
        double cost = hourlyRate * hours;
        if (isCertified) {
            cost *= 1.1; // 10% extra for certified trainers
        }
        return cost;
    }

    // Method 3: Check if trainer can train a specific member (extra)
    public boolean canTrainMember(Member member) {
        return member.isActive() && member.getBalance() >= hourlyRate;
    }

    // 7. toString() METHOD
    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experienceYears=" + experienceYears +
                ", isCertified=" + isCertified +
                ", hourlyRate=" + hourlyRate + " KZT/hour" +
                '}';
    }
}