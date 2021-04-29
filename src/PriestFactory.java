public class PriestFactory extends KnightFactory
{
    //TODO
    @Override
    public Knight produce(Team team) {
        Priest newPriest = new Priest(team.teamColor, team.getStartingCoordinate(team.teamColor));
        team.members.add(newPriest);
        return newPriest;
    }
}
