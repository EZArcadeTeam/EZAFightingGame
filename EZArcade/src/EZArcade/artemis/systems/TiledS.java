package ezarcade.artemis.systems;

import ezarcade.artemis.DGWorld;
import ezarcade.artemis.components.TiledC;

import com.artemis.ComponentMapper;
import com.artemis.annotations.Mapper;
import com.artemis.systems.*;

public class TiledS extends VoidEntitySystem {
	@Mapper ComponentMapper<TiledC> tiledMap;
	
	@Override
	protected void processSystem() {
		DGWorld.backRenderer.setView(DGWorld.camera);
		DGWorld.backRenderer.render();
		DGWorld.frontRenderer.setView(DGWorld.camera);
		DGWorld.frontRenderer.render();
	}
}
