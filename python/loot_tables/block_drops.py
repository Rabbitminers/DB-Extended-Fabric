import os
import re

output = '''
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1.0,
      "bonus_rolls": 0.0,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "dbe:BLOCKNAME"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
'''


blocks = ['lightoff', 'alarm_lightoff', 'green_light_off', 'blue_light_off', 'sound_generator', 'particle_generator', 'vocals_generator', 'copper_coil', 'pc_setup', 'server_rack', 'computer_terminal_steel', 'computer_terminal', 'isolinear_front_blue', 'isolinear_middle_blue', 'isolinear_back_blue', 'isolinear_front_red', 'isolinear_middle_red', 'isolinear_back_red', 'isolinear_front_green', 'isolinear_middle_green', 'isolinear_back_green', 'laboratory_block', 'cut_laboratory_block', 'laboratory_vent', 'laboratory_panel', 'laboratory_stripe', 'laboratory_roman_1', 'laboratory_left_arrow', 'laboratory_right_arrow', 'laboratory_roman_5', 'laboratory_roman_10', 'stripedblock', 'strippedblock_horizontal', 'stripedblock_middle', 'yellow_arrow_left', 'yellow_arrow_right', 'alarm_block', 'radiation_block', 'biohazard_block', 'death_block', 'electricity_block', 'cross_block', 'exit_sign', 'tungsten_carbite', 'steel_block', 'steel_plating', 'steel_pillar', 'steel_seemless', 'polished_steel_plating', 'steel_tiles', 'steel_stairs', 'steel_slab', 'steel_frame', 'steel_wall', 'steel_coloumn', 'steel_girder', 'steel_door', 'steel_trapdoor', 'steel_mesh_trapdoor', 'vent_straight', 'vent_l', 'vent_l_up', 'vent_l_down', 'create_boiler', 'copper_boiler', 'zinc_boiler', 'brass_boiler', 'white_steel_plating', 'white_steel_stairs', 'white_steel_slab', 'white_steel_trapdoor', 'white_steel_wall', 'white_steel_tank', 'white_gilded_steel_tank', 'white_boiler', 'white_gilded_boiler', 'orange_steel_plating', 'orange_steel_stairs', 'orange_steel_slab', 'orange_steel_trapdoor', 'orange_steel_wall', 'orange_steel_tank', 'orange_gilded_steel_tank', 'orange_boiler', 'orange_gilded_boiler', 'magenta_steel_plating', 'magenta_steel_stairs', 'magenta_steel_slab', 'magenta_steel_trapdoor', 'magenta_steel_wall', 'magenta_steel_tank', 'magenta_gilded_steel_tank', 'magenta_boiler', 'magenta_gilded_boiler', 'light_blue_steel_plating', 'light_blue_steel_stairs', 'light_blue_steel_slab', 'light_blue_steel_trapdoor', 'light_blue_steel_wall', 'light_blue_steel_tank', 'light_blue_gilded_steel_tank', 'light_blue_boiler', 'light_blue_gilded_boiler', 'yellow_steel_plating', 'yellow_steel_stairs', 'yellow_steel_slab', 'yellow_steel_trapdoor', 'yellow_steel_wall', 'yellow_steel_tank', 'yellow_gilded_steel_tank', 'yellow_boiler', 'yellow_gilded_boiler', 'lime_steel_plating', 'lime_steel_stairs', 'lime_steel_slab', 'lime_steel_trapdoor', 'lime_steel_wall', 'lime_steel_tank', 'lime_gilded_steel_tank', 'lime_boiler', 'lime_gilded_boiler', 'pink_steel_plating', 'pink_steel_stairs', 'pink_steel_slab', 'pink_steel_trapdoor', 'pink_steel_wall', 'pink_steel_tank', 'pink_gilded_steel_tank', 'pink_boiler', 'pink_gilded_boiler', 'gray_steel_plating', 'gray_steel_stairs', 'gray_steel_slab', 'gray_steel_trapdoor', 'gray_steel_wall', 'gray_steel_tank', 'gray_gilded_steel_tank', 'gray_boiler', 'gray_gilded_boiler', 'light_gray_steel_plating', 'light_gray_steel_stairs', 'light_gray_steel_slab', 'light_gray_steel_trapdoor', 'light_gray_steel_wall', 'light_gray_steel_tank', 'light_gray_gilded_steel_tank', 'light_gray_boiler', 'light_gray_gilded_boiler', 'cyan_steel_plating', 'cyan_steel_stairs', 'cyan_steel_slab', 'cyan_steel_trapdoor', 'cyan_steel_wall', 'cyan_steel_tank', 'cyan_gilded_steel_tank', 'cyan_boiler', 'cyan_gilded_boiler', 'purple_steel_plating', 'purple_steel_stairs', 'purple_steel_slab', 'purple_steel_trapdoor', 'purple_steel_wall', 'purple_steel_tank', 'purple_gilded_steel_tank', 'purple_boiler', 'purple_gilded_boiler', 'blue_steel_plating', 'blue_steel_stairs', 'blue_steel_slab', 'blue_steel_trapdoor', 'blue_steel_wall', 'blue_steel_tank', 'blue_gilded_steel_tank', 'blue_boiler', 'blue_gilded_boiler', 'brown_steel_plating', 'brown_steel_stairs', 'brown_steel_slab', 'brown_steel_trapdoor', 'brown_steel_wall', 'brown_steel_tank', 'brown_gilded_steel_tank', 'brown_boiler', 'brown_gilded_boiler', 'green_steel_plating', 'green_steel_stairs', 'green_steel_slab', 'green_steel_trapdoor', 'green_steel_wall', 'green_steel_tank', 'green_gilded_steel_tank', 'green_boiler', 'green_gilded_boiler', 'red_steel_plating', 'red_steel_stairs', 'red_steel_slab', 'red_steel_trapdoor', 'red_steel_wall', 'red_steel_tank', 'red_guilded_steel_tank', 'red_boiler', 'red_guilded_boiler', 'black_steel_plating', 'black_steel_stairs', 'black_steel_slab', 'black_steel_trapdoor', 'black_steel_wall', 'black_steel_tank', 'black_guilder_steel_tank', 'black_boiler', 'black_guilded_boiler', 'track_end', 'alarm_sign', 'no_entry_sign', 'oneway_sign', 'arrow_up_sign', 'arrow_down_sign', 'arrow_left_sign', 'arrow_right_sign', 'arrow_return_sign', 'ballast', 'ballast_slab', 'gravel_slab', 'rocky_dirt', 'rocky_dirt_slab', 'dirt_slab', 'half_lumber_border', 'half_lumber_horizontal', 'half_lumber_vertical', 'half_lumber_diagonal_left', 'half_lumber_diagonal_right', 'half_lumber_brick_border', 'half_lumber_brick_horizontal', 'half_lumber_brick_vertical', 'half_lumber_brick_diagonal_left', 'half_lumber_brick_diagonal_right', 'full_log_pile', 'log_pile_1_top', 'log_pile_2_bottom', 'log_pile_2_top', 'log_pile_1_bottom', 'log_palisade', 'log_pile_chair', 'book_1', 'book_2', 'skeleton_1', 'skeleton_2', 'skeleton_3', 'skeleton_4', 'skeleton_5', 'skeleton_6', 'white_quilted_wool', 'orange_quilted_wool', 'magenta_quilted_wool', 'light_blue_quilted_wool', 'yellow_quilted_wool', 'lime_quilted_wool', 'pink_quilted_wool', 'gray_quilted_wool', 'light_gray_quilted_wool', 'cyan_quilted_wool', 'purple_quilted_wool', 'blue_quilted_wool', 'brown_quilted_wool', 'green_quilted_wool', 'red_quilted_wool', 'black_quilted_wool', 'white_chair', 'orange_chair', 'magenta_chair', 'light_blue_chair', 'yellow_chair', 'lime_chair', 'pink_chair', 'gray_chair', 'light_gray_chair', 'cyan_chair', 'purple_chair', 'blue_chair', 'brown_chair', 'green_chair', 'red_chair', 'black_chair', 'soft_air', 'hard_air', 'reinforced_glass', 'oneway_stone', 'oneway_laboratory_block', 'vanta_black', 'green_screen', 'blue_screen', 'rubber_duck', 'lighton', 'alarm_lighton', 'green_light_on', 'blue_light_on', 'piss_on', 'piss_off', 'white_train_lamp']

def main():
    for block in blocks:
        with open(f"output/{block}.json", "w") as f:
            f.write(re.sub("BLOCKNAME", block, output))

if __name__ == '__main__':
    main()