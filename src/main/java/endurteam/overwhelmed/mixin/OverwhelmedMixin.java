package endurteam.overwhelmed.mixin;

import endurteam.overwhelmed.block.OverwhelmedBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(OverwhelmedMixin.class)
public abstract class OverwhelmedMixin extends Entity {
	@Shadow
	private Optional<BlockPos> lastClimbablePos;

	public OverwhelmedMixin(EntityType<?> type, World world) {
		super(type, world);
	}

	@Inject(method = "onClimbable", at = @At("TAIL"), cancellable = true)
	public void onClimableMixin(CallbackInfoReturnable<Boolean> cir) {
		Direction result = Direction.fromRotation(this.getY());
		BlockPos blockPos = this.getBlockPos().offset(result);
		BlockState state = this.getWorld().getBlockState(blockPos);
		if (state.isOf(OverwhelmedBlocks.STRIPPED_WILLOW_LOG))
		{
			this.lastClimbablePos = Optional.of(blockPos);
			cir.setReturnValue(true);
		}
	}
}