package pojo.traditional;


public class Athlete {

  /**
   * defining as private as encapulation to be used only via getter and setter
   */
  private String firstName;
  private String lastName;
  private String state;
  private String brmStatus;

  public static void main(String[] args)
    {
      Athlete athlete = new Athlete("Avishek", "Behera", "Odisha", "SR");
      System.out.println(athlete);
    }

  public Athlete(String firstName, String lastName, String state, String brmStatus)
    {
      this.firstName = firstName;
      this.lastName = lastName;
      this.state = state;
      this.brmStatus = brmStatus;
    }

  /**
   * This will be used to print the Pojo object as String
   */
  @Override
  public String toString()
    {
      return "CreateAthlete [firstName=" + firstName + ", lastName=" + lastName + ", state=" + state + ", brmStatus="
              + brmStatus + "]";
    }

  /**
   * Getters and Setters for all private fields
   */
  public String getFirstName()
    {
      return firstName;
    }

  public void setFirstName(String firstName)
    {
      this.firstName = firstName;
    }

  public String getLastName()
    {
      return lastName;
    }

  public void setLastName(String lastName)
    {
      this.lastName = lastName;
    }

  public String getState()
    {
      return state;
    }

  public void setState(String state)
    {
      this.state = state;
    }

  public String getBrmStatus()
    {
      return brmStatus;
    }

  public void setBrmStatus(String brmStatus)
    {
      this.brmStatus = brmStatus;
    }

}
