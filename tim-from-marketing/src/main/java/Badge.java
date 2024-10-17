import java.util.Locale;

class Badge {
    public String print(Integer id, String name, String department) {
        Employee emp = new Employee(id, name, department);
        if (id == null) {
            return emp.getNewEmployeeBadge();
        } else if (department == null) {
            return emp.getOwnerBadge();
        } else {
            return emp.getFullBadge();
        }
    }
    private static class Employee {
        private Integer id;
        private String name;
        private String department;

        public Employee(Integer id, String name, String department) {
            this.id = id;
            this.name = name;
            if (department == null) {
                this.department = "OWNER";
            } else {
                this.department = department.toUpperCase(Locale.ROOT);
            }
        }

        private String getFullBadge() {
            return String.format("[%s] - %s - %s", id, name, department);
        }

        private String getNewEmployeeBadge() {
            return String.format("%s - %s", name, department);
        }

        private String getOwnerBadge() {
            return id == null ? String.format("%s - OWNER", name) : String.format("[%s] - %s - OWNER", id, name);
        }

    }
}

