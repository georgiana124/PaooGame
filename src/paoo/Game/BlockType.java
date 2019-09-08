package paoo.Game;

/**
 * this class also is redundant, enums the blocks for the map but it isn't necessary
 */
public enum BlockType {
    GRASS(0), SOIL(1), WATER(2), TREE(3), MOUNTAIN(4), TOWN(5);

    private final int value;

    private BlockType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static BlockType getTypeFromInt(int value) {
        return BlockType.values()[value];
    }
}
