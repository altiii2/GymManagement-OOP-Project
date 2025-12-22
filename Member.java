public class Member {
    // 1. PRIVATE FIELDS (minimum 4)
    private int memberId;
    private String name;
    private int age;
    private String membershipType;
    private boolean isActive;
    private double balance;

    // 2. CONSTRUCTOR WITH PARAMETERS
    public Member(int memberId, String name, int age, String membershipType, boolean isActive, double balance) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.isActive = isActive;
        this.balance = balance;
    }

    // 3. DEFAULT CONSTRUCTOR (optional)
    public Member() {
        this.memberId = 0;
        this.name = "Unknown";
        this.age = 18;
        this.membershipType = "Basic";
        this.isActive = false;
        this.balance = 0.0;
    }

    // 4. GETTERS
    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public boolean isActive() {
        return isActive;
    }

    public double getBalance() {
        return balance;
    }

    // 5. SETTERS
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 6. ADDITIONAL METHODS (minimum 2)

    // Method 1: Upgrade membership
    public void upgradeMembership(String newType) {
        if (newType.equals("Premium") && balance >= 50000) {
            membershipType = newType;
            System.out.println(name + " upgraded to Premium membership!");
        } else if (newType.equals("Gold") && balance >= 30000) {
            membershipType = newType;
            System.out.println(name + " upgraded to Gold membership!");
        } else {
            System.out.println("Cannot upgrade. Insufficient balance or invalid type.");
        }
    }

    // Method 2: Check if member is eligible for discount
    public boolean isEligibleForDiscount() {
        return age < 25 || age > 60 || membershipType.equals("Premium");
    }

    // Method 3: Add workout session (extra method)
    public void addWorkoutSession(double sessionCost) {
        if (balance >= sessionCost) {
            balance -= sessionCost;
            System.out.println("Workout session added. New balance: " + balance + " KZT");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // 7. toString() METHOD
    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", membershipType='" + membershipType + '\'' +
                ", isActive=" + isActive +
                ", balance=" + balance + " KZT" +
                '}';
    }
}
