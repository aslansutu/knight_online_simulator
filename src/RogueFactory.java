public class RogueFactory extends KnightFactory
{
    /**
     * Produces a new Rogue for a specific team
     * @param team either team Karus or ElMorad
     * @return the newly spawned knight
     */
    @Override
    public Knight produce(Team team) {
        Rogue newRogue = new Rogue(team.teamColor, team.getStartingCoordinate(team.teamColor));
        team.members.add(newRogue);
        return newRogue;
    }
}
