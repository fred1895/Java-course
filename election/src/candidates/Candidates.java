package candidates;

import candidates.enums.CandidateState;

public abstract class Candidates {
	private String name;
	private String politicalParty;
	protected Integer number;
	private Integer votes = 0;
	private CandidateState state;
	private Integer nullVotes = 0;
	private Integer totalVotes = 0;
	
	public Candidates() {
		
	}
	public Candidates(String name, String politicalParty, Integer number) {
		this.name = name;
		this.politicalParty = politicalParty;
		this.number = number;
	}
	
	public Candidates(String name, String politicalParty, Integer number, CandidateState state) {
		this.name = name;
		this.politicalParty = politicalParty;
		this.number = number;
		this.state = state;
	}

	public CandidateState getState() {
		return state;
	}

	public void setState(CandidateState state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoliticalParty() {
		return politicalParty;
	}

	public void setPoliticalParty(String politicalParty) {
		this.politicalParty = politicalParty;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getVotes() {
		return votes;
	}
	
	public void countVotes() {
		votes++;
	}
	
	public void countNullVotes() {
		nullVotes++;
	}
	
	public Integer getNullVotes() {
		return nullVotes;
	}
	
	public Integer getTotalVotes() {
		return totalVotes;
	}

	
	@Override
	public String toString() {
		return String.format("Candidate %s: %s (%d) - %s", name, politicalParty, number, state);
	}
	
}