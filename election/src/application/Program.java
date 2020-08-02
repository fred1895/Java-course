package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import candidates.Candidates;
import candidates.CandidatesDeputadosEstaduais;
import candidates.CandidatesDeputadosFederais;
import candidates.CandidatesGovernadores;
import candidates.CandidatesPresidentes;
import candidates.CandidatesSenadores;
import candidates.enums.CandidateState;
import winner.Winners;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Candidates> candidates = new ArrayList<>();

		System.out.println("Register the candidates: ");
		char answer;

		do {
			System.out.println("DEPUTADOS ESTADUAIS: ");
			System.out.println("Candidate data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Polical party: ");
			String politicalParty = sc.nextLine();
			System.out.print("Candidate's number: ");
			int number = sc.nextInt();
			System.out.print("Candidate's state(SP, RJ, MG, ES): ");
			String state = sc.next();

			candidates
					.add(new CandidatesDeputadosEstaduais(name, politicalParty, number, CandidateState.valueOf(state)));
			System.out.print("Keep adding? (y/n) ");
			answer = sc.next().charAt(0);
			sc.nextLine();
			clearScreen();
		} while (looping(answer));
		System.out.println();

		do {
			System.out.println("DEPUTADOS FEDERAIS: ");
			System.out.println("Candidate data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Polical party: ");
			String politicalParty = sc.nextLine();
			System.out.print("Candidate's number: ");
			int number = sc.nextInt();
			System.out.print("Candidate's state(SP, RJ, MG, ES): ");
			String state = sc.next();

			candidates
					.add(new CandidatesDeputadosFederais(name, politicalParty, number, CandidateState.valueOf(state)));
			System.out.print("Keep adding? (y/n) ");
			answer = sc.next().charAt(0);
			sc.nextLine();
			clearScreen();
		} while (looping(answer));
		System.out.println();

		do {
			System.out.println("SENADORES: ");
			System.out.println("Candidate data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Polical party: ");
			String politicalParty = sc.nextLine();
			System.out.print("Candidate's number: ");
			int number = sc.nextInt();
			System.out.print("Candidate's state(SP, RJ, MG, ES): ");
			String state = sc.next();

			candidates.add(new CandidatesSenadores(name, politicalParty, number, CandidateState.valueOf(state)));
			System.out.print("Keep adding? (y/n) ");
			answer = sc.next().charAt(0);
			sc.nextLine();
			clearScreen();
		} while (looping(answer));

		System.out.println();

		do {
			System.out.println("GOVERNADORES: ");
			System.out.println("Candidate  data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Polical party: ");
			String politicalParty = sc.nextLine();
			System.out.print("Candidate's number: ");
			int number = sc.nextInt();
			System.out.print("Candidate's state(SP, RJ, MG, ES): ");
			String state = sc.next();

			candidates.add(new CandidatesGovernadores(name, politicalParty, number, CandidateState.valueOf(state)));
			System.out.print("Keep adding? (y/n) ");
			answer = sc.next().charAt(0);
			sc.nextLine();
			clearScreen();
		} while (looping(answer));
		System.out.println();

		do {
			System.out.println("PRESIDENTES: ");
			System.out.println("Candidate data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Polical party: ");
			String politicalParty = sc.nextLine();
			System.out.print("Candidate's number: ");
			int number = sc.nextInt();

			candidates.add(new CandidatesPresidentes(name, politicalParty, number));
			System.out.print("Keep adding? (y/n) ");
			answer = sc.next().charAt(0);
			sc.nextLine();
			clearScreen();
		} while (looping(answer));

		System.out.println();
		System.out.println("Deputados estaduais:");
		for (Candidates c : candidates) {
			if (c instanceof CandidatesDeputadosEstaduais) {
				System.out.println((CandidatesDeputadosEstaduais) c);
			}
		}
		System.out.println();
		System.out.println("Deputados federais:");
		for (Candidates c : candidates) {
			if (c instanceof CandidatesDeputadosFederais) {
				System.out.println((CandidatesDeputadosFederais) c);
			}
		}
		System.out.println();
		System.out.println("Senadores:");
		for (Candidates c : candidates) {
			if (c instanceof CandidatesSenadores) {
				System.out.println((CandidatesSenadores) c);
			}
		}
		System.out.println();
		System.out.println("Governadores:");
		for (Candidates c : candidates) {
			if (c instanceof CandidatesGovernadores) {
				System.out.println((CandidatesGovernadores) c);
			}
		}
		System.out.println();
		System.out.println("Presidentes:");
		for (Candidates c : candidates) {
			if (c instanceof CandidatesPresidentes) {
				System.out.println((CandidatesPresidentes) c);
			}
		}
		System.out.println("---------------------------------");
		System.out.println("-------------Election------------");
		System.out.println();
		System.out.print("Insert yor state(SP, RJ, MG, ES): ");
		String state = sc.next();
		clearScreen();
		System.out.println("Depuados estaduais de " + state);
		for (Candidates c : candidates) {
			if (c.getState() == CandidateState.valueOf(state)) {
				if (c instanceof CandidatesDeputadosEstaduais) {
					System.out.println(c.toString());
				}
			}
		}
		System.out.println();
		System.out.println("Depuados federais de " + state);
		for (Candidates c : candidates) {
			if (c.getState() == CandidateState.valueOf(state)) {
				if (c instanceof CandidatesDeputadosFederais) {
					System.out.println(c.toString());
				}
			}
		}
		System.out.println();
		System.out.println("Senadores de " + state);
		for (Candidates c : candidates) {
			if (c.getState() == CandidateState.valueOf(state)) {
				if (c instanceof CandidatesSenadores) {
					System.out.println(c.toString());
				}
			}
		}
		System.out.println();
		System.out.println("Governadores de " + state);
		for (Candidates c : candidates) {
			if (c.getState() == CandidateState.valueOf(state)) {
				if (c instanceof CandidatesGovernadores) {
					System.out.println(c.toString());
				}
			}
		}
		System.out.println();
		System.out.println("Presidentes:");
		for (Candidates c : candidates) {
			if (c instanceof CandidatesPresidentes) {
				System.out.println((CandidatesPresidentes) c);
			}
		}
		System.out.println();
		do {
			System.out.println("VOTES: ");
			System.out.println("Deputado estadual:");
			System.out.print("Enter yout vote: ");
			int vote = sc.nextInt();
			for (Candidates c : candidates) {
				if (c.getState() == CandidateState.valueOf(state)) {
					if (c instanceof CandidatesDeputadosEstaduais) {
						if (returnVote(c, vote) != null) {
							System.out.println(returnVote(c, vote));
							c.countVotes();
						}
						if (returnVote(c, vote) == null) {
							System.out.println("Voto nulo");
						}
					}
				}
			}
			clearScreen();

			System.out.println("Deputado federal:");
			System.out.print("Enter yout vote: ");
			vote = sc.nextInt();
			for (Candidates c : candidates) {
				if (c.getState() == CandidateState.valueOf(state)) {
					if (c instanceof CandidatesDeputadosFederais) {
						if (returnVote(c, vote) != null) {
							System.out.println(returnVote(c, vote));
							c.countVotes();
						}
						if (returnVote(c, vote) == null) {
							System.out.println("Voto nulo");
						}
					}
				}
			}
			clearScreen();

			System.out.println("Senador: ");
			System.out.print("Enter yout vote: ");
			vote = sc.nextInt();
			for (Candidates c : candidates) {
				if (c.getState() == CandidateState.valueOf(state)) {
					if (c instanceof CandidatesSenadores) {
						if (returnVote(c, vote) != null) {
							System.out.println(returnVote(c, vote));
							c.countVotes();
						}
						if (returnVote(c, vote) == null) {
							System.out.println("Voto nulo");
						}
					}
				}
			}
			clearScreen();

			System.out.println("Governador: ");
			System.out.print("Enter yout vote: ");
			vote = sc.nextInt();
			for (Candidates c : candidates) {
				if (c.getState() == CandidateState.valueOf(state)) {
					if (c instanceof CandidatesGovernadores) {
						if (returnVote(c, vote) != null) {
							System.out.println(returnVote(c, vote));
							c.countVotes();
						}
						if (returnVote(c, vote) == null) {
							System.out.println("Voto nulo");
						}
					}
				}
			}
			clearScreen();

			System.out.println("Presidente: ");
			System.out.print("Enter yout vote: ");
			vote = sc.nextInt();
			for (Candidates c : candidates) {
				if (c instanceof CandidatesPresidentes) {
					if (returnVote(c, vote) != null) {
						System.out.println(returnVote(c, vote));
						c.countVotes();
					}
					if (returnVote(c, vote) == null) {
						System.out.println("Voto nulo");
					}

				}
			}
			System.out.print("Are there more people to vote?  (y/n) ");
			answer = sc.next().charAt(0);
			clearScreen();
		} while (looping(answer));

		System.out.println("Votos:");
		for (Candidates c : candidates) {
			if (candidatesVotes(c) != null) {
				System.out.println(candidatesVotes(c));
			}
		}
		System.out.println();
		sc.close();
	}

	/****************************************
	 * ***************************************
	 **************************/
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static boolean looping(char answer) {
		if (answer == 'y' || answer == 'Y') {
			return true;
		}
		return false;
	}

	public static String returnVote(Candidates c, int vote) {
		if (vote == c.getNumber()) {
			return c.toString();
		}
		return null;
	}

	public static String candidatesVotes(Candidates c) {
		if (c.getVotes() > 0) {
			return c.toString() + " obteve " + c.getVotes() + " votos";
		}
		return null;
	}

}
