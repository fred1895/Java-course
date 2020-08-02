package candidates;

public class CandidatesPresidentes extends Candidates {

	public CandidatesPresidentes(String name, String politicalParty, Integer number) {
		super(name, politicalParty, number);
	}
	
	@Override
	public String toString() {
		return String.format("Candidate %s: %s (%d)", super.getName(), super.getPoliticalParty(), number);
	}
}
