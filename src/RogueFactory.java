public class RogueFactory extends KnightFactory
{
    //TODO
    @Override
    public Knight produce(Team team) {
        Rogue newRogue = new Rogue(team.teamColor, team.getStartingCoordinate(team.teamColor));
        team.members.add(newRogue);
        return newRogue;
    }
}
