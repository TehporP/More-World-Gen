package bwg4.biomes;

import java.util.Random;

import bwg4.util.PerlinNoise;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public interface RealisticBiome
{
    public void rDecorate(World world, Random rand, int chunkX, int chunkY, PerlinNoise perlin);
    public float rNoise(PerlinNoise perlin, int x, int y);
    public void rReplace(Block[] blocks, byte[] metadata, int i, int j, int x, int y, int depth, Random rand, PerlinNoise perlin, float[] noise);
    public float r3Dnoise(float z);
}
