public class MageFactory extends KnightFactory
{
    /**
     * Produces a new mage for a specific team
     * @param team either team Karus or ElMorad
     * @return the newly spawned knight
     */
    @Override
    public Knight produce(Team team) {
        Mage newMage = new Mage(team.teamColor, team.getStartingCoordinate(team.teamColor));
        team.members.add(newMage);
        return newMage;
    }
}
