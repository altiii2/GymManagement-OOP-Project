public class WorkoutSession {
    // 1. PRIVATE FIELDS (minimum 4)
    private int sessionId;
    private String memberName;
    private String trainerName;
    private int durationMinutes;
    private String sessionType;
    private boolean isCompleted;

    // 2. CONSTRUCTOR WITH PARAMETERS
    public WorkoutSession(int sessionId, String memberName, String trainerName, int durationMinutes, String sessionType, boolean isCompleted) {
        this.sessionId = sessionId;
        this.memberName = memberName;
        this.trainerName = trainerName;
        this.durationMinutes = durationMinutes;
        this.sessionType = sessionType;
        this.isCompleted = isCompleted;
    }

    // 3. DEFAULT CONSTRUCTOR
    public WorkoutSession() {
        this.sessionId = 0;
        this.memberName = "Unknown Member";
        this.trainerName = "Unknown Trainer";
        this.durationMinutes = 60;
        this.sessionType = "General Training";
        this.isCompleted = false;
    }

    // 4. GETTERS
    public int getSessionId() {
        return sessionId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getSessionType() {
        return sessionType;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // 5. SETTERS
    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    // 6. ADDITIONAL METHODS (minimum 2)

    // Method 1: Extend session duration
    public void extendSession(int additionalMinutes) {
        if (additionalMinutes > 0) {
            durationMinutes += additionalMinutes;
            System.out.println("Session extended by " + additionalMinutes + " minutes. New duration: " + durationMinutes + " min");
        }
    }

    // Method 2: Mark session as completed
    public void markCompleted() {
        if (!isCompleted) {
            isCompleted = true;
            System.out.println("Session " + sessionId + " marked as completed.");
        } else {
            System.out.println("Session already completed.");
        }
    }

    // Method 3: Check if session is intensive (extra)
    public boolean isIntensive() {
        return durationMinutes > 90 || sessionType.equals("HIIT") || sessionType.equals("CrossFit");
    }

    // 7. toString() METHOD
    @Override
    public String toString() {
        return "WorkoutSession{" +
                "sessionId=" + sessionId +
                ", memberName='" + memberName + '\'' +
                ", trainerName='" + trainerName + '\'' +
                ", durationMinutes=" + durationMinutes +
                ", sessionType='" + sessionType + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
