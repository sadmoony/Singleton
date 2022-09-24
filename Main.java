public class Main {
    public static void main(String[] args){

        Registry hr = Registry.getRegistry();

        employee emp1 = null;
        try{
            emp1 = new employee("Saske", "Uchiha", 1500);
            emp1.printemployee();
            hr.addWorker(emp1);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        Manager emp2 = null;
        try{
            emp2 = new Manager("Naruto", "Uzumaki", 2000, 100);
            emp2.printemployee();
            hr.addWorker(emp2);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        employee emp3 = null;
        try{
            emp3 = new employee("Saske", "Uchiha", 1500);
            emp3.printemployee();
            hr.addWorker(emp3);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nEmployee List:");
        hr.printList();
    }
}
