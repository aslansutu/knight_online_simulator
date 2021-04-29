public class PriestFactory extends KnightFactory
{
    /**
     * Produces a new priest for a specific team
     * @param team either team Karus or ElMorad
     * @return the newly spawned knight
     */
    @Override
    public Knight produce(Team team) {
        Priest newPriest = new Priest(team.teamColor, team.getStartingCoordinate(team.teamColor));
        team.members.add(newPriest);
        return newPriest;
    }
}
