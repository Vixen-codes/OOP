package ProblemSet_7b;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String urn;
	private List<Module> moduleList;

	public Student(String name, String urn) {
		this.name = formatName(name);
		this.urn = validateUrn(urn);
		this.moduleList = new ArrayList<>();
	}

	private String formatName(String name) {
		if (name == null || name.isEmpty()) {
			return name;
		}
		String[] words = name.trim().split("\\s+");
		StringBuilder formatted = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 0) {
				formatted.append(Character.toUpperCase(words[i].charAt(0)));
				formatted.append(words[i].substring(1).toLowerCase());
				if (i < words.length - 1) {
					formatted.append(" ");
				}
			}
		}
		return formatted.toString();
	}

	private String validateUrn(String urn) {
		if (urn != null && urn.matches("\\d{5}")) {
			return urn;
		}
		return "00000";
	}

	public int getUrn() {
		return Integer.parseInt(urn);
	}

	public String getName() {
		return name;
	}

	public void addModuleList(Module module) {
		if (module == null) {
		}
		if (!moduleExists(module)) {
			moduleList.add(module);
		}
	}

	private boolean moduleExists(Module module) {
		for (Module m : moduleList) {
			if (m.getName().equals(module.getName())) {
				return true;
			}
		}
		return false;
	}

	public String printModules() {
		if (moduleList.isEmpty()) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < moduleList.size(); i++) {
			result.append(moduleList.get(i).getName());
			if (i < moduleList.size() - 1) {
				result.append(", ");
			}
		}
		return result.toString();
	}

	@Override
	public String toString() {
		return name + "(" + urn + ")";
	}
}
