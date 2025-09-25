package gregtech.api.capability;

public interface IMultiblockController {
    // Checks if structure is formed
    boolean isStructureFormed();
    // Checks if structure is obstructed and by default this is always false, but subclasses can override this and their own logic
    default boolean isStructureObstructed() {
        return false;
    }
}
