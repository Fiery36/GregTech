package gregtech.api.capability;

public interface IControllable {

    // This is a method that is implicitly public and abstract since it's inside an interface
    // Checks if the machine is allowed to work or not (getter)
    /**
     * @return true if the controllable is allowed to work
     */
    boolean isWorkingEnabled();

    // Changes whether the machine is allowed to work or not (setter)
    /**
     * Set if the controllable can work or not
     *
     * @param isWorkingAllowed true if the workable can work, otherwise false
     */
    void setWorkingEnabled(boolean isWorkingAllowed);
}
