
public interface IEntityRepository <T extends IEntity>{
	void add();
	void delete();
	void update();
}
