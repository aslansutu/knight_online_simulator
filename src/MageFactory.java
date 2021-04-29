public class MageFactory extends KnightFactory
{
    //TODO
    @Override
    public Knight produce(Team team) {
        Mage newMage = new Mage(team.teamColor, team.getStartingCoordinate(team.teamColor));
        team.members.add(newMage);
        return newMage;
    }
}
