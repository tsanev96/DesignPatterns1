package template;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    // use this if u need to pass the auditTrail outside of this class
//    public Task(AuditTrail auditTrail) {
//        this.auditTrail = auditTrail;
//    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
