package ezarcade.artemis.systems;

import ezarcade.artemis.components.ItemC;

import com.artemis.Aspect;
import com.artemis.Entity;
import com.artemis.EntitySystem;
import com.artemis.utils.ImmutableBag;

public class EntityManagementS extends EntitySystem {
	public static boolean remove = false;

	@SuppressWarnings("unchecked")
	public EntityManagementS() {
		super(Aspect.getAspectForAll(ItemC.class));
	}

	@Override
	protected void processEntities(ImmutableBag<Entity> entities) {
		for (int i = 0, s = entities.size(); s > i; i++) {
			process(entities.get(i));
		}
	}
	
	private void process(Entity e) {
		e.deleteFromWorld();
	}

	protected boolean checkProcessing() {
		if(remove)
			return true;
		return false;
	}
	

}
