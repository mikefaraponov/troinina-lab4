package as111.ssm.comparators;

import as111.ssm.User;

public class ContractIdComparator extends UserComparator {
	
	@Override
	public int compare(User first, User second) {
		return first.getContractId().compareTo(second.getContractId());
	}

	@Override
	public String getComparatorName() {
		return "Contract Id";
	}
}