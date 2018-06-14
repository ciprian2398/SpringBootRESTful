package enums;

public class PlayerRoleConverter {
    public static PlayerRole getRole(String role){
        if(role.equalsIgnoreCase("ATTACKER")) return PlayerRole.ATTACKER;
        if(role.equalsIgnoreCase("DEFENDER")) return PlayerRole.DEFENDER;
        if(role.equalsIgnoreCase("GOALKEEPER")) return PlayerRole.GOALKEEPER;
        return null;
    }
}
