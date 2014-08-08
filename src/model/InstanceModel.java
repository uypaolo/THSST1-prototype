package model;

public class InstanceModel{
	
	private String entityType;
	private String instanceName;
	
	public InstanceModel(String type, String name){
		entityType = type;
		instanceName = name;
	}
	
	@Override
    public String toString()
    {
        return instanceName;
    }

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
}
