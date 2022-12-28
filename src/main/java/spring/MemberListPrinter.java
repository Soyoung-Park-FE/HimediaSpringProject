package spring;

public class MemberListPrinter {
	
	public class MemberListPrinter {
		private MemberDao mnemnerDao;
		private MemberPeinter printer;
		
		public MemberListPrinter (MemberDao memberDao, Memberprinter printer) {
			this.memberDao = memberDao;
			this.printer = printer;
		}
		
		public void peintAll() {
			Collection<Member> members = memberDao.selectAll();
			
			for (Member member : members) {
				printer.print(member);
			}
		}
	}

}
